/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2017-04-18 01:05:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.7.RELEASE.jar", Long.valueOf(1492046936256L));
    _jspx_dependants.put("jar:file:/C:/spring_project/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring-final/WEB-INF/lib/spring-webmvc-4.3.7.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1488324888000L));
    _jspx_dependants.put("/WEB-INF/views/navi/adminnavi.jsp", Long.valueOf(1492475124943L));
    _jspx_dependants.put("/WEB-INF/views/footer/footer.jsp", Long.valueOf(1492070914174L));
    _jspx_dependants.put("/WEB-INF/views/navi/adminSidebar.jsp", Long.valueOf(1492392887825L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fenctype_005fcommandName_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fpath_005fcssClass_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fenctype_005fcommandName_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fpath_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fenctype_005fcommandName_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fpath_005fcssClass_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write(" <style type=\"text/css\">\r\n");
      out.write(" \r\n");
      out.write("@import url('//maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css');\r\n");
      out.write("\r\n");
      out.write(".navbar-default .navbar-nav #user-profile {\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    padding-top: 15px;\r\n");
      out.write("    padding-left: 58px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-default .navbar-nav #user-profile img {\r\n");
      out.write("    height: 45px;\r\n");
      out.write("    width: 45px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 2px;\r\n");
      out.write("    left: 8px;\r\n");
      out.write("    padding: 1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#wrapper {\r\n");
      out.write("    padding-top: 50px;\r\n");
      out.write("    padding-left: 0;\r\n");
      out.write("    -webkit-transition: all .5s ease;\r\n");
      out.write("    -moz-transition: all .5s ease;\r\n");
      out.write("    -o-transition: all .5s ease;\r\n");
      out.write("    transition: all .5s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media (min-width: 992px) {\r\n");
      out.write("    #wrapper {\r\n");
      out.write("        padding-left: 225px;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media (min-width: 992px) {\r\n");
      out.write("    #wrapper #sidebar-wrapper {\r\n");
      out.write("        width: 225px;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sidebar-wrapper {\r\n");
      out.write("    border-right: 1px solid #e7e7e7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sidebar-wrapper {\r\n");
      out.write("    z-index: 1000;\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    left: 225px;\r\n");
      out.write("    width: 0;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    margin-left: -225px;\r\n");
      out.write("    overflow-y: auto;\r\n");
      out.write("    background: #f8f8f8;\r\n");
      out.write("    -webkit-transition: all .5s ease;\r\n");
      out.write("    -moz-transition: all .5s ease;\r\n");
      out.write("    -o-transition: all .5s ease;\r\n");
      out.write("    transition: all .5s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sidebar-wrapper .sidebar-nav {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    width: 225px;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    list-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sidebar-wrapper .sidebar-nav li {\r\n");
      out.write("    text-indent: 0;\r\n");
      out.write("    line-height: 45px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sidebar-wrapper .sidebar-nav li a {\r\n");
      out.write("    display: block;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sidebar-wrapper .sidebar-nav li a .sidebar-icon {\r\n");
      out.write("    width: 45px;\r\n");
      out.write("    height: 45px;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    padding: 0 2px;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    text-indent: 7px;\r\n");
      out.write("    margin-right: 10px;\r\n");
      out.write("    color: #000;\r\n");
      out.write("    float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sidebar-wrapper .sidebar-nav li a .caret {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  right: 23px;\r\n");
      out.write("  top: auto;\r\n");
      out.write("  margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sidebar-wrapper .sidebar-nav li ul.panel-collapse {\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    -moz-padding-start: 0;\r\n");
      out.write("    -webkit-padding-start: 0;\r\n");
      out.write("    -khtml-padding-start: 0;\r\n");
      out.write("    -o-padding-start: 0;\r\n");
      out.write("    padding-start: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sidebar-wrapper .sidebar-nav li ul.panel-collapse li i {\r\n");
      out.write("    margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sidebar-wrapper .sidebar-nav li ul.panel-collapse li {\r\n");
      out.write("    text-indent: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media (max-width: 992px) {\r\n");
      out.write("    #wrapper #sidebar-wrapper {\r\n");
      out.write("        width: 45px;\r\n");
      out.write("    }\r\n");
      out.write("    #wrapper #sidebar-wrapper #sidebar #sidemenu li ul {\r\n");
      out.write("        position: fixed;\r\n");
      out.write("        left: 45px;\r\n");
      out.write("        margin-top: -45px;\r\n");
      out.write("        z-index: 1000;\r\n");
      out.write("        width: 200px;\r\n");
      out.write("        height: 0;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidebar-nav li a {\r\n");
      out.write("    color: #fff !important;\r\n");
      out.write("}\r\n");
      out.write(".sidebar-nav li ul li a {\r\n");
      out.write("\tbackground-color: #fff !important;\r\n");
      out.write("\tcolor: #0077e5 !important;\t\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("    <div id=\"navbar-wrapper\">\r\n");
      out.write("        <header>\r\n");
      out.write("            <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\" style=\"background-color: #4296dc;\">            \r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"navbar-header\">\r\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar-collapse\">\r\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                            <span class=\"icon-bar\"></span>\r\n");
      out.write("                            <span class=\"icon-bar\"></span>\r\n");
      out.write("                            <span class=\"icon-bar\"></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <a class=\"navbar-brand\" href=\"home\" style=\"color: white;\"><span class=\"glyphicon glyphicon-education\"></span> JHTA 학사 관리 시스템</a>\r\n");
      out.write("                            <ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t      <li><a href=\"searchstud\" style=\"color: white;\">학적 관리</a></li>\r\n");
      out.write("\t\t\t\t\t\t      <li><a href=\"#\" style=\"color: white;\">교과 관리</a></li>\r\n");
      out.write("\t\t\t\t\t\t      <li><a href=\"#\" style=\"color: white;\">수업 관리</a></li>\r\n");
      out.write("\t\t\t\t\t\t      <li><a href=\"#\" style=\"color: white;\">수강 관리</a></li>\r\n");
      out.write("\t\t\t\t\t\t      <li><a href=\"#\" style=\"color: white;\">성적 관리</a></li>\r\n");
      out.write("    \t\t\t\t\t\t</ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div id=\"navbar-collapse\" class=\"collapse navbar-collapse\">\r\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        \t<li><a id=\"user-profile\" href=\"#\"style=\"color: white;\"><img src=\"/jhta/resources/images/student/PeoPleDefault.png\" class=\"img-responsive img-thumbnail img-circle\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGIN_USER.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("님 환영합니다.</a></li>\r\n");
      out.write("                            <li><a href=\"#\" style=\"color: white;\">내 정보 수정</a></li>\r\n");
      out.write("                            <li><a href=\"/jhta/logout\" style=\"color: white;\">로그아웃</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("    </div>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("        <div id=\"sidebar-wrapper\">\r\n");
      out.write("            <aside id=\"sidebar\">\r\n");
      out.write("                <ul id=\"sidemenu\" class=\"sidebar-nav\" style=\"background-color: #4296dc;\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"accordion-toggle collapsed toggle-switch\" data-toggle=\"collapse\" data-target=\"#submenu-2\">\r\n");
      out.write("                            <span class=\"sidebar-icon\"></span><span class=\"sidebar-title\">사용자 조회</span>\r\n");
      out.write("                            <b class=\"caret\"></b>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul id=\"submenu-2\" class=\"panel-collapse collapse panel-switch\" role=\"menu\">\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i>학생 정보 조회</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i>교수 정보 조회</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"accordion-toggle collapsed toggle-switch\" data-toggle=\"collapse\" href=\"#submenu-3\">\r\n");
      out.write("                            <span class=\"sidebar-icon\"></span><span class=\"sidebar-title\">입학관리</span>\r\n");
      out.write("                            <b class=\"caret\"></b>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul id=\"submenu-3\" class=\"panel-collapse collapse panel-switch\" role=\"menu\">\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i>신입학 등록</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i>신입학 조회</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i>재입학 등록</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i>재입학 조회</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"accordion-toggle collapsed toggle-switch\" data-toggle=\"collapse\" href=\"#submenu-4\">\r\n");
      out.write("                            <span class=\"sidebar-icon\"></span><span class=\"sidebar-title\">휴학 관리</span>\r\n");
      out.write("                            <b class=\"caret\"></b>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul id=\"submenu-4\" class=\"panel-collapse collapse panel-switch\" role=\"menu\">\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i>휴학 신청 목록</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i>휴학 승인 목록</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"accordion-toggle collapsed toggle-switch\" data-toggle=\"collapse\" href=\"#submenu-5\">\r\n");
      out.write("                            <span class=\"sidebar-icon\"></span><span class=\"sidebar-title\">복학 관리</span>\r\n");
      out.write("                            <b class=\"caret\"></b>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul id=\"submenu-5\" class=\"panel-collapse collapse panel-switch\" role=\"menu\">\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i>복학 신청 목록</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i>복학 승인 목록</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"accordion-toggle collapsed toggle-switch\" data-toggle=\"collapse\" href=\"#submenu-6\">\r\n");
      out.write("                            <span class=\"sidebar-icon\"></span><span class=\"sidebar-title\">전과 관리</span>\r\n");
      out.write("                            <b class=\"caret\"></b>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul id=\"submenu-6\" class=\"panel-collapse collapse panel-switch\" role=\"menu\">\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i>전체 전과 내역 조회</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i>전과 신청 목록</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i>전과 승인 목록</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"accordion-toggle collapsed toggle-switch\" data-toggle=\"collapse\" href=\"#submenu-7\">\r\n");
      out.write("                            <span class=\"sidebar-icon\"></span><span class=\"sidebar-title\">게시판 관리</span>\r\n");
      out.write("                            <b class=\"caret\"></b>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul id=\"submenu-7\" class=\"panel-collapse collapse panel-switch\" role=\"menu\">\r\n");
      out.write("                            <li><a href=\"boardmanagement\"><i class=\"fa fa-caret-right\"></i>강의 게시판 관리</a></li>\r\n");
      out.write("                            <li><a href=\"homeboard\"><i class=\"fa fa-caret-right\"></i>홈페이지 게시판 관리</a></li>\r\n");
      out.write("                            <li><a href=\"board\"><i class=\"fa fa-caret-right\"></i>전체 공지관리</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"accordion-toggle collapsed toggle-switch\" data-toggle=\"collapse\" href=\"#submenu-8\">\r\n");
      out.write("                            <span class=\"sidebar-icon\"></span><span class=\"sidebar-title\">자퇴 관리</span>\r\n");
      out.write("                            <b class=\"caret\"></b>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul id=\"submenu-8\" class=\"panel-collapse collapse panel-switch\" role=\"menu\">\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i>자퇴 신청 목록</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i>자퇴 승인 목록</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </aside>            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\" style=\"margin-left: 250px; padding-top:25px;\">\r\n");
      out.write("\t\t<div class=\"row text-right\">\r\n");
      out.write("\t\t\t홈 > 학적관리 > 입학관리 > 신입학 조회 \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<h4><span class=\"glyphicon glyphicon-th-list\"></span> 공지사항 작성</h4>\r\n");
      out.write("\t\t\t<hr style=\"border:solid 0.5px #2C7BB5;\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"margin-top: 20px;\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fenctype_005fcommandName_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      try {
        _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
        _jspx_th_form_005fform_005f0.setParent(null);
        // /WEB-INF/views/board/boardform.jsp(28,3) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_form_005fform_005f0.setAction("boardForm");
        // /WEB-INF/views/board/boardform.jsp(28,3) name = enctype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_form_005fform_005f0.setEnctype("multipart/form-data");
        // /WEB-INF/views/board/boardform.jsp(28,3) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_form_005fform_005f0.setCommandName("boardForm");
        int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
          if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t<div class=\"form-group\">\r\n");
              out.write("\t\t\t\t\t<label>제목</label>\r\n");
              out.write("\t\t\t\t\t");
              if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  form:errors
              org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
              try {
                _jspx_th_form_005ferrors_005f0.setPageContext(_jspx_page_context);
                _jspx_th_form_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
                // /WEB-INF/views/board/boardform.jsp(32,5) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005ferrors_005f0.setPath("title");
                // /WEB-INF/views/board/boardform.jsp(32,5) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005ferrors_005f0.setCssClass("text-danger");
                int[] _jspx_push_body_count_form_005ferrors_005f0 = new int[] { 0 };
                try {
                  int _jspx_eval_form_005ferrors_005f0 = _jspx_th_form_005ferrors_005f0.doStartTag();
                  if (_jspx_th_form_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    return;
                  }
                } catch (java.lang.Throwable _jspx_exception) {
                  while (_jspx_push_body_count_form_005ferrors_005f0[0]-- > 0)
                    out = _jspx_page_context.popBody();
                  _jspx_th_form_005ferrors_005f0.doCatch(_jspx_exception);
                } finally {
                  _jspx_th_form_005ferrors_005f0.doFinally();
                }
              } finally {
                _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f0);
              }
              out.write("\r\n");
              out.write("\t\t\t\t</div>\r\n");
              out.write("\t\t\t\t<div class=\"form-group\">\r\n");
              out.write("\t\t\t\t\t<label>내용</label>\r\n");
              out.write("\t\t\t\t\t");
              if (_jspx_meth_form_005ftextarea_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t\t");
              //  form:errors
              org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
              try {
                _jspx_th_form_005ferrors_005f1.setPageContext(_jspx_page_context);
                _jspx_th_form_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
                // /WEB-INF/views/board/boardform.jsp(37,5) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005ferrors_005f1.setPath("contents");
                // /WEB-INF/views/board/boardform.jsp(37,5) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                _jspx_th_form_005ferrors_005f1.setCssClass("text-danger");
                int[] _jspx_push_body_count_form_005ferrors_005f1 = new int[] { 0 };
                try {
                  int _jspx_eval_form_005ferrors_005f1 = _jspx_th_form_005ferrors_005f1.doStartTag();
                  if (_jspx_th_form_005ferrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    return;
                  }
                } catch (java.lang.Throwable _jspx_exception) {
                  while (_jspx_push_body_count_form_005ferrors_005f1[0]-- > 0)
                    out = _jspx_page_context.popBody();
                  _jspx_th_form_005ferrors_005f1.doCatch(_jspx_exception);
                } finally {
                  _jspx_th_form_005ferrors_005f1.doFinally();
                }
              } finally {
                _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f1);
              }
              out.write("\r\n");
              out.write("\t\t\t\t</div>\r\n");
              out.write("\t\t\t\t<div class=\"form-inline\">\r\n");
              out.write("\t\t\t\t\t<input style=\"width: 1120px;\" type=\"file\" class=\"form-control\" name=\"attachFile\">\r\n");
              out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default btn-sm\">등록</button>\r\n");
              out.write("\t\t\t\t</div>\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_form_005fform_005f0.doFinally();
        }
      } finally {
        _005fjspx_005ftagPool_005fform_005fform_0026_005fenctype_005fcommandName_005faction.reuse(_jspx_th_form_005fform_005f0);
      }
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("        \r\n");
      out.write("\t\t</div>\r\n");
      out.write("        <!-- /#page-wrapper -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /#wrapper -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    try {
      _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/views/board/boardform.jsp(31,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f0.setPath("title");
      // /WEB-INF/views/board/boardform.jsp(31,5) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005finput_005f0.setCssClass("form-control");
      int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
        if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005finput_005f0.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f0 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    try {
      _jspx_th_form_005ftextarea_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
      // /WEB-INF/views/board/boardform.jsp(36,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005ftextarea_005f0.setPath("contents");
      // /WEB-INF/views/board/boardform.jsp(36,5) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005ftextarea_005f0.setCssClass("form-control");
      int[] _jspx_push_body_count_form_005ftextarea_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005ftextarea_005f0 = _jspx_th_form_005ftextarea_005f0.doStartTag();
        if (_jspx_th_form_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005ftextarea_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005ftextarea_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005ftextarea_005f0.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_form_005ftextarea_005f0);
    }
    return false;
  }
}