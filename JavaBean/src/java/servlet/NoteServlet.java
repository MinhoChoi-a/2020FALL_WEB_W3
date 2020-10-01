/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 *
 * @author minho
 */
public class NoteServlet extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String param = request.getParameter("edit");
        
        System.out.println(param);
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        String title = br.readLine();
        String content = br.readLine();
        
        br.close();
        
        request.setAttribute("title", title);
        request.setAttribute("content", content);
        
        if(param != null) {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                .forward(request,response); }            
        
        else {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request,response); }
                
    }
        
        
    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String title = request.getParameter("inputTitle");
        String content = request.getParameter("inputContent");
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        File ff = new File(path);
        FileWriter writer = new FileWriter(ff, false);
        
        writer.write(title);
        writer.write("\n");
        writer.write(content);
        
        writer.flush();
        writer.close();
        
        request.setAttribute("title", title);
        request.setAttribute("content", content);        
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);        
    }


}
   