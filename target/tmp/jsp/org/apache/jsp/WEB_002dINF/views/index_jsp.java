package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<title>Home</title>\n");
      out.write("<link\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("resources/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("resources/css/index.css\"\n");
      out.write("\tmedia=\"screen\">\n");
      out.write("<script src=\"resources/js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div>\n");
      out.write("\t\t<table cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<div id=\"content\">\n");
      out.write("\t\t\t\t\t\t<div id=\"menu\" align=\"center\" class=\"imagem0\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"navbar\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"index\"> Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"carrinho\"> Carrinho</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"pedidos\"> Ver Pedidos</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"fatura\"> Fatura</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"login\">Login</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"contato\"> Contato </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div id=\"barradebusca\">\n");
      out.write("\t\t\t\t\t\t\t\t<strong><h1 id=\"carousel\">Naaky Games</h1></strong> <input\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" id=\"googlesearch\"><input type=\"button\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-small btn-primary\" value=\"Pesquisar\"> <br /></br>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<strong><h2>Produtos</h2></strong>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<br /></br> </br>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div id=\"imagem\">\n");
      out.write("\t\t\t\t\t\t\t\t<font align=\"center\" color=\"blue\"> <a href=\"comprarps4\"><img\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"resources/Imagens/a.png\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonMouseOver=\"this.src='resources/Imagens/f.png'\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonMouseOut=\"this.src='resources/Imagens/a.png'\" width=\"500\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\theight=\"300\"></img></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Valor:R$1.669,00</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>12x R$161,32</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>sem juros</p>\n");
      out.write("\t\t\t\t\t\t\t\t</font>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div id=\"imagem1\">\n");
      out.write("\t\t\t\t\t\t\t\t<font align=\"center\" color=\"red\"> <a href=\"comprarxbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"resources/Imagens/x.png\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonMouseOver=\"this.src='resources/Imagens/d.png'\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonMouseOut=\"this.src='resources/Imagens/x.png'\" width=\"500\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\theight=\"300\"></img>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Valor:R$1.999,00</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>12x R$165,83</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>sem juros</p>\n");
      out.write("\t\t\t\t\t\t\t\t</font>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<br />\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div id=\"imagem2\">\n");
      out.write("\t\t\t\t\t\t\t\t<font align=\"center\" color=\"red\"> <a href=\"comprarps3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"resources/Imagens/PS3.png\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonMouseOver=\"this.src='resources/Imagens/e.png'\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonMouseOut=\"this.src='resources/Imagens/PS3.png'\" width=\"500\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\theight=\"300\"></img>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Valor:R$1.249,00</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>12x R$104,80</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>sem juros</p></font>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div id=\"imagem3\">\n");
      out.write("\t\t\t\t\t\t\t\t<font align=\"center\" color=\"red\"> <a href=\"Comprarwii\"><img\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"resources/Imagens/b.png\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonMouseOver=\"this.src='resources/Imagens/c.png'\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonMouseOut=\"this.src='resources/Imagens/b.png'\" width=\"500\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\theight=\"300\"></img></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Valor:R$489,90</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>12x R$48,83\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>sem juros</p>\n");
      out.write("\t\t\t\t\t\t\t\t</font>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div> </font>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<script src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<script src=\"resources/js/jquery.js\"></script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t$('#carousel').animate({\n");
      out.write("\t\t\t\t\"margin-left\" : \"+=800\"\n");
      out.write("\t\t\t}, 10000);\n");
      out.write("\n");
      out.write("\t\t\t$(\"h1,h2\").mouseover(function() {\n");
      out.write("\t\t\t\t$(this).css('color', 'black');\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(\"h1,h2\").mouseout(function() {\n");
      out.write("\t\t\t\t$(this).css('color', 'red');\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t$(\"p\").mouseover(function() {\n");
      out.write("\t\t\t\t$(this).css('color', 'black');\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$(\"p\").mouseout(function() {\n");
      out.write("\t\t\t\t$(this).css('color', 'red');\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t$('p').animate({\n");
      out.write("\t\t\t\tmarginLeft : 10\n");
      out.write("\t\t\t}, 200);\n");
      out.write("\n");
      out.write("\t\t\t$('p:animated').css({\n");
      out.write("\t\t\t\tcolor : \"#ff0000\"\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t$('p').hover(function() {\n");
      out.write("\n");
      out.write("\t\t\t\t$(this).stop().animate({\n");
      out.write("\t\t\t\t\tmarginLeft : 20\n");
      out.write("\t\t\t\t}, 500)\n");
      out.write("\t\t\t},\n");
      out.write("\n");
      out.write("\t\t\tfunction() {\n");
      out.write("\n");
      out.write("\t\t\t\t$(this).stop().animate({\n");
      out.write("\t\t\t\t\tmarginLeft : 0\n");
      out.write("\t\t\t\t}, 500);\n");
      out.write("\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t$(\"#hide\").click(function() {\n");
      out.write("\t\t\t\t\t$(\"ul\").hide();\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$(\"#show\").click(function() {\n");
      out.write("\t\t\t\t\t$(\"ul\").show();\n");
      out.write("\t\t\t\t\t$('li').animate(\"slow\");\n");
      out.write("\t\t\t\t\tslideUp();\n");
      out.write("\t\t\t\t\tslideDown();\n");
      out.write("\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t$(\"#hide\").mouseover(function() {\n");
      out.write("\t\t\t\t\t$(this).css('color', 'black');\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$(\"#hide\").mouseout(function() {\n");
      out.write("\t\t\t\t\t$(this).css('color', 'red');\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$(\"#show\").mouseover(function() {\n");
      out.write("\t\t\t\t\t$(this).css('color', 'black');\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$(\"#show\").mouseout(function() {\n");
      out.write("\t\t\t\t\t$(this).css('color', 'red');\n");
      out.write("\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t$(document).ready(function() {\n");
      out.write("\n");
      out.write("\t\t\t\t\tvar speedText = 300;\n");
      out.write("\n");
      out.write("\t\t\t\t\tvar speedJump = 200;\n");
      out.write("\n");
      out.write("\t\t\t\t\t$(\"#menu\").hover(\n");
      out.write("\n");
      out.write("\t\t\t\t\tfunction() {\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t$(this).next(\"span\").stop().animate({\n");
      out.write("\t\t\t\t\t\t\theight : \"70px\",\n");
      out.write("\t\t\t\t\t\t}, speedJump);\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t$(this).stop().animate({\n");
      out.write("\t\t\t\t\t\t\tlineHeight : \"40px\"\n");
      out.write("\t\t\t\t\t\t}, speedText);\n");
      out.write("\n");
      out.write("\t\t\t\t\t}, function() {\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t$(this).next(\"span\").stop().animate({\n");
      out.write("\t\t\t\t\t\t\theight : \"0px\"\n");
      out.write("\t\t\t\t\t\t}, speedJump);\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t$(this).stop().animate({\n");
      out.write("\t\t\t\t\t\t\tlineHeight : \"30px\"\n");
      out.write("\t\t\t\t\t\t}, speedText);\n");
      out.write("\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
