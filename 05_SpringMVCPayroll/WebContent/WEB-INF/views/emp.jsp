<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Form</title>
</head>
<body>
    <h1>Employee Form</h1>
    
    <!-- Bind the form to the Employee object -->
    <sf:form modelAttribute="employee">
        <div>
            <label for="id">ID:</label>
            <sf:input path="id" id="id" type="number" required="true" />
        </div>
        <br>
        <div>
            <label for="name">Name:</label>
            <sf:input path="name" id="name" type="text" required="true" />
        </div>
        <br>
        <div>
            <label for="designation">Designation:</label>
            <sf:input path="designation" id="designation" type="text" required="true" />
        </div>
        <br>
        <div>
            <label for="email">Email:</label>
            <sf:input path="email" id="email" type="email" required="true" />
        </div>
        <br>
        <div>
            <button type="submit" value="Save Employee">Submit</button>
        </div>
    </sf:form>
    
    <!-- Display success or error message -->
    <c:if test="${not empty message}">
        <p style="color: green;">${message}</p>
    </c:if>
    <c:if test="${not empty errorMessage}">
        <p style="color: red;">${errorMessage}</p>
    </c:if>
</body>
</html>
