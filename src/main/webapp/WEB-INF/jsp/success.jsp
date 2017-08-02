<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>this is not struts demo</title>
</head>
<body>
<s:debug></s:debug>
<tr>
    <s:iterator id="user" value="users">
        <td>
        <s:property value="username"/> |
        </td>
    </s:iterator>
</tr>
</body>
</html>
