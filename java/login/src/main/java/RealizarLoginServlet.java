import jakarta.servlet.http.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RealizarLoginServlet", urlPatterns = {"/RealizarLogin"})
public class RealizarLoginServlet extends HttpServlet { 
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        PrintWriter out = response.getWriter();

        // pegando os parametros do request 
        String nome = request.getParameter("username");
        String senha = request.getParameter("password");

        // monta o html apresenta os dados digitados 
        if(nome === senha){
            out.println("<html>");
            out.println("<body>");
            out.println("Welcome! " + nome);
            out.println("</body>");
            out.println("</html>");
        }else{
            out.println("<html>");
            out.println("<body>");
            out.println("Usuário e senha incorretos");
            out.println("</body>");
            out.println("</html>");
        }
    }
}