<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Form</title>
    <style>
        /* Global Styling */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f7f7f7;
            color: #333;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            flex-direction: column;
        }

        h1 {
            text-align: center;
            font-size: 32px;
            color: #4CAF50;
            margin-top: 50px;
            transition: color 0.3s ease-in-out;
        }

        h1:hover {
            color: #45a049;
        }

        h2 {
            text-align: center;
            font-size: 24px;
            color: #333;
        }

        /* Form Styling */
        .sf\:form {
            max-width: 600px;
            margin: 20px auto;
            background-color: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
            transform: translateY(-20px);
            opacity: 0;
            animation: formAnimation 0.6s forwards ease-out;
        }

        @keyframes formAnimation {
            to {
                transform: translateY(0);
                opacity: 1;
            }
        }

        .sf\:form div {
            margin-bottom: 20px;
        }

        .sf\:form label {
            font-size: 16px;
            color: #555;
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
            transition: color 0.3s ease-in-out;
        }

        .sf\:form label:hover {
            color: #4CAF50;
        }

        .sf\:form input {
            width: 100%;
            padding: 12px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 6px;
            box-sizing: border-box;
            transition: border 0.3s ease-in-out, box-shadow 0.3s ease-in-out;
        }

        .sf\:form input:focus {
            border-color: #4CAF50;
            box-shadow: 0 0 8px rgba(76, 175, 80, 0.4);
            outline: none;
        }

        .sf\:form button {
            background-color: #4CAF50;
            color: #fff;
            border: none;
            padding: 12px 20px;
            font-size: 16px;
            border-radius: 6px;
            cursor: pointer;
            width: 100%;
            transition: background-color 0.3s ease;
        }

        .sf\:form button:hover {
            background-color: #45a049;
        }

        /* Message Styling */
        .message {
            text-align: center;
            font-size: 18px;
            padding: 12px;
            margin-top: 20px;
            border-radius: 8px;
            transition: opacity 0.5s ease;
        }

        .message.success {
            background-color: #dff0d8;
            color: #3c763d;
            animation: fadeIn 0.5s ease-out;
        }

        .message.error {
            background-color: #f2dede;
            color: #a94442;
            animation: fadeIn 0.5s ease-out;
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
            }
            to {
                opacity: 1;
            }
        }

        /* Table Styling */
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 30px;
            border: 1px solid #ddd;
            border-radius: 8px;
            overflow: hidden;
        }

        table th, table td {
            padding: 15px;
            text-align: left;
            font-size: 16px;
            transition: background-color 0.3s ease;
        }

        table th {
            background-color: #f4f4f4;
            color: #333;
        }

        table tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        table tr:hover {
            background-color: #f1f1f1;
            transform: translateY(-2px);
            transition: transform 0.2s ease-in-out;
        }

        /* Responsive Design */
        @media (max-width: 768px) {
            .sf\:form {
                width: 90%;
                padding: 20px;
            }

            table {
                font-size: 14px;
            }

            table th, table td {
                padding: 10px;
            }
        }
    </style>
</head>
<body>
    <h1>Employee Form</h1>

    <!-- Employee form -->
    <sf:form modelAttribute="employee" class="sf:form">
        <div>
            <label for="id">ID:</label>
            <sf:input path="id" id="id" type="number" required="true" />
        </div>
        <div>
            <label for="name">Name:</label>
            <sf:input path="name" id="name" type="text" required="true" />
        </div>
        <div>
            <label for="designation">Designation:</label>
            <sf:input path="designation" id="designation" type="text" required="true" />
        </div>
        <div>
            <label for="email">Email:</label>
            <sf:input path="email" id="email" type="email" required="true" />
        </div>
        <div>
            <button type="submit">Save Employee</button>
        </div>
    </sf:form>

    <!-- Display messages -->
    <c:if test="${not empty message}">
        <p class="message success">${message}</p>
    </c:if>
    <c:if test="${not empty errorMessage}">
        <p class="message error">${errorMessage}</p>
    </c:if>

    <!-- Display employee list -->
    <h2>Employee List</h2>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Designation</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="emp" items="${employees}">
                <tr>
                    <td>${emp.id}</td>
                    <td>${emp.name}</td>
                    <td>${emp.designation}</td>
                    <td>${emp.email}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
