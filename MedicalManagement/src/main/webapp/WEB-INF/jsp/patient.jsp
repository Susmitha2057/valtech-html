<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>PATIENT LOGIN</title>
    <style>
        h1{
            text-align: center;
        }
        table.center {
            margin-left:auto; 
            margin-right:auto;
        }
    </style>
</head>
<body>
<form action="PatientPage" modelAttribute="login" method="POST">
    <h1>PATIENT'S LOGIN</h1>
    <table class="center">
        <tr>
            <td>USER NAME</td>
            <td> 
                <input name="userName" type="text" required>
            </td>
        </tr>
        <tr>
            <td>PASSWORD</td>
            <td> 
                <input name="password" type="password" required>
            </td>
        </tr>
        <tr>
            <td> &nbsp; </td>
            <td> 
                <button id="submitBtn" type="submit">Login</button>
            </td>
        </tr>
        <tr>
            <td>NEW USER</td>
            <td>
                <a href="register">Register here</a>
            </td>
        </tr>
    </table>
    <h3 align="center">${message}</h3>
</form>
</body>
</html>