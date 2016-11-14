
package com.codeandlens;

import com.entity.Member;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author chivas
 */

@Controller
public class CalWeb {
    
    @RequestMapping("/home")
    String index(){
        return "index";
    }
    
    SessionFactory factory = new Configuration()
        .addPackage("entity")
        .addAnnotatedClass(Member.class)
        .buildSessionFactory();
    
    @RequestMapping("/list")
    String list(Model model){
        Session database = factory.openSession();
        List list = database.createQuery("from Member").list();
        database.close();
	model.addAttribute("members", list);
        return "list";
        }
    
    
    
    
    
    @RequestMapping("/login")
    String login(HttpSession session) {
            if (session.getAttribute("user") == null) {
                    return "login";
            } else {
                    return "redirect:/";
            }
        }
        
    @RequestMapping(value="/login", method=RequestMethod.POST)
	String login(HttpSession session, String email, String password) {
		Session database = factory.openSession();
		org.hibernate.Query query = database.createQuery(
			"from Member where email = :email and password = :password");
		query.setParameter("email", email); 
		query.setParameter("password", encode(password));
		List list = query.list();
		
		if (list.size() == 1) {
			Member member = (Member)list.get(0);
			session.setAttribute("member", member);
			database.close();
			return "redirect:/list-angular";
		} else {
			return "login";
		}
	}    
    
    @RequestMapping("/list-angular")
    String viewAngular() {
	return "list-angular";
        }
    
    @RequestMapping("/get-member-list") @ResponseBody
    List listAngularAjax() {
        List list = new ArrayList();
        Session session = factory.openSession();
        list = session.createQuery("from Member").list();
        session.close();
        return list;
	}
  
    String encode(String s) {
		String result = "";
		try {
			java.security.MessageDigest digest = java.security.MessageDigest.
				getInstance("SHA-256");
			byte[] hash = digest.digest(s.getBytes("UTF-8"));
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if (hex.length() == 1)
					result += '0';
				result += hex;
			}
		} catch (Exception e) {}
		return result;
	}
    
    @RequestMapping("/register-member")
	String register() {
		return "register-member";
	}
    
    @RequestMapping("/setting")
	String setting(HttpSession session) {
            if (session.getAttribute("member") == null) {
			return "redirect:/login";
		} else {
			return "setting";
		}
	}    
        
    @RequestMapping(value="/register-member", method=RequestMethod.POST)
	String register(String email, String password, String name, String sername, String address, String tel, String nickname) {
		Member member = new Member();
                member.setName(name);
                member.setSername(sername);
                member.setNickname(nickname);
                member.setAddress(address);
                member.setTel(tel);
		member.setEmail(email);
		member.setPassword(encode(password));
		
		Session database = factory.openSession();
		database.save(member);
		//database.flush();
		database.close();
             
			//หาวิธี redirect ไปหา list ไม่ได้ ยัง งงๆอยู่
                return "redirect:/list-angular";
	}
        
        @RequestMapping("/view-member/{id}")
	String view(Model model, @PathVariable long id) {
		Member membered = new Member();
		Session database = factory.openSession();
		membered = (Member)database.get(Member.class, id);
		database.close();
		model.addAttribute("membered", membered);
		return "view-member";
	}
        
        
        @RequestMapping(value="/updateMember", method=RequestMethod.POST)
	String profile(HttpSession session, String email, String name, String sername, String address, String tel, String nickname) {
		if (session.getAttribute("member") == null) {
			return "redirect:/login";
		} else {
			Member member = (Member)session.getAttribute("member");
			member.setName(name);
                        member.setSername(sername);
                        member.setNickname(nickname);
                        member.setAddress(address);
                        member.setTel(tel);
                        member.setEmail(email);
                        member.setPassword(member.getPassword());
                        
                        session.removeAttribute("member");
			session.setAttribute("member", member);
			Session database = factory.openSession();
			database.update(member);
			//database.flush();
			database.close();
			return "redirect:/list-angular";
		}
	}
        
        @RequestMapping("/logout")
	String logout(HttpSession session) {
		session.removeAttribute("email");
		session.invalidate();
		return "redirect:/login";
	}
}