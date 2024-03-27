<%@ taglib prefix="o" uri="jakarta.tags.core" %><html>
<head>
  <title>Fonts</title>
</head>
<body>
<o:forEach var="row" items="${requestScope.rows}">
  <p style="font-size:${requestScope.fontSize}px">${row}</p>
</o:forEach>
</body>
</html>
