package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>Home</title>\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("resources/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("resources/css/index.css\" media=\"screen\">\n");
      out.write("\t<script src=\"resources/js/jquery.js\" type=\"text/javascript\"></script>   \n");
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
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"index.jsp\"> Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"carrinho.jsp\"> Carrinho</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"pedidos.jsp\"> Ver Pedidos</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"fatura.jsp\"> Fatura</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"loguin.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"contato.jsp\"> Contato </a></li>\n");
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
      out.write("\t\t\t\t\t\t<title>Cadastro</title> <strong><font color=\"red\"><h2>Cadastro\n");
      out.write("\t\t\t\t\t\t\t\t\tRápido</h2></font></strong>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<form id=\"cadastro\" name=\"cadastro\" method=\"post\" action=\"\"\n");
      out.write("\t\t\t\t\t\t\tonsubmit=\"return validaCampo(); return false;\">\n");
      out.write("\t\t\t\t\t\t\t<table align=\"center\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Nome:</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input name=\"nome\" type=\"text\" id=\"nome\" /> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"style1\">*</span></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr id=\"jogo\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Data de Nascimento:</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input name=\"nascimento\" type=\"date\" /> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"style1\">*</span></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr id=\"anda\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>DDD:</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input name=\"ddd\" type=\"text\" id=\"ddd\" /><br />\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Telefone:</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input name=\"telefone\" type=\"text\" id=\"telefone\" /> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"style3\">(Apenas números)</span></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Email:</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input name=\"email\" type=\"text\" id=\"email\" /> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"style1\">*</span></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Endereço:</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input name=\"endereco\" type=\"text\" id=\"endereco\" /> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"style1\">*</span></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td>Número:</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><input name=\"numero\" type=\"number\" id=\"date\" /> <span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"style1\">*</span></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>CEP:</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input name=\"cep\" type=\"number\" id=\"nome\" /> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"style1\">*</span></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Cidade:</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input name=\"cidade\" type=\"text\" id=\"nome\" /> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"style1\">*</span></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Estado:</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><select name=\"estado\" id=\"estado\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>Selecione...</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"AC\">AC</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"AL\">AL</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"AP\">AP</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"AM\">AM</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"BA\">BA</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"CE\">CE</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"ES\">ES</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"DF\">DF</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"MA\">MA</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"MT\">MT</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"MS\">MS</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"MG\">MG</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"PA\">PA</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"PB\">PB</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"PR\">PR</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"PE\">PE</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"PI\">PI</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"RJ\">RJ</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"RN\">RN</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"RS\">RS</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"RO\">RO</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"RR\">RR</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"SC\">SC</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"SP\">SP</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"SE\">SE</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"TO\">TO</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select> <span class=\"style1\"> </span></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"2\"><input name=\"news\" type=\"checkbox\"\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"news\" value=\"ATIVO\" checked=\"checked\"> Desejo\n");
      out.write("\t\t\t\t\t\t\t\t\treceber Promoções de ofertas deste Site!</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"2\"><h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"btn btn-small btn-primary\" type=\"submit\" id=\"cadastrar\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"Ok\" /> <input class=\"btn btn-small btn-primary\" type=\"reset\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tid=\"limpar\" value=\"Limpar\" /> <span class=\"style1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tCampos com (*)são obrigatórios! </span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h4> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<script src=\"resources/js/bootstrap.min.js\"></script>\n");
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
      out.write("\t\t\t\tmarginLeft : 150\n");
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
