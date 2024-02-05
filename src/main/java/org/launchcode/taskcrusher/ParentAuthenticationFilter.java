//package org.launchcode.taskcrusher;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//import org.launchcode.taskcrusher.controllers.ParentAuthenticationController;
//import org.launchcode.taskcrusher.models.ParentUser;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.query.JSqlParserUtils;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//
//public class ParentAuthenticationFilter implements HandlerInterceptor {
//
//    @Autowired
//    ParentAuthenticationController parentAuthenticationController;
//
//    // This allows certain pages and static resources to be seen by the public (not logged in)
//    // May be changing some of the page names
//    private static final List<String> whitelist = Arrays.asList("/api", "/api/register", "/api/parentLogin",
//            "/css", "images");
//
//    //This checks all pages and static resources against blacklist
//    private static boolean isWhitelisted(String path) {
//        for (String pathRoot : whitelist) {
//            if (path.equals("/") || path.startsWith(pathRoot)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public boolean preHandle(HttpServletRequest request,
//                             HttpServletResponse response,
//                             Object handler) throws IOException {
////        System.out.println(1111111);
////        // Don't require sign in for whitelisted pages
////        //Early return to allow request to go through
////        boolean abd = isWhitelisted(request.getRequestURI());
////        System.out.println(abd);
//        return true;
//
////        HttpSession session = request.getSession();
////        ParentUser parentUser = parentAuthenticationController.getParentUserFromSession(session);
////
////        // If the user is logged it
////        if (parentUser != null) {
////            return true;
////        }
////        // IF the user is not logged in
////        response.sendRedirect("/parent-login");
//    }
//}
