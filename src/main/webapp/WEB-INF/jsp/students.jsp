<table>
    <tr><th>Name</th><th>Email</th><th>Courses</th><th>Actions</th></tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>
                <c:forEach var="course" items="${student.courses}">
                    ${course.name} <br/>
                </c:forEach>
            </td>
            <td><a href="${pageContext.request.contextPath}/students/edit/${student.id}">Edit</a></td>
        </tr>
    </c:forEach>
</table>
