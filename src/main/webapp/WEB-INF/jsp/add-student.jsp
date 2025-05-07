<form action="${pageContext.request.contextPath}/students/save" method="post">
    Name: <input type="text" name="name" />
    Email: <input type="text" name="email" />
    Courses:
    <c:forEach items="${courses}" var="course">
        <input type="checkbox" name="courses" value="${course.id}" /> ${course.name}
    </c:forEach>
    <input type="submit" value="Save Student" />
</form>
