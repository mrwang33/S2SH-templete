<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>this is not only struts demo</title>
</head>
<body>
<s:debug></s:debug>
<tr>
    <s:iterator id="user" value="users">
        <td>
        <s:property value="username"/>
            <s:iterator id="phone" value="phoneSet" >
                <s:property value="brand"/>:
                <s:property value="model"/>
            </s:iterator>
            |
        </td>
    </s:iterator>
</tr>
</body>
</html>
