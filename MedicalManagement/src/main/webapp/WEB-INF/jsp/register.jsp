<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>REGISTRATION FORM</title>
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
<form action="RegisterPage" method="POST">
    <h1>REGISTRATION FORM</h1>
    <table class="center">
        <tr>
            <td>User name</td>
            <td>
                <input name="userName" type="text" required>
            </td>
        </tr>
       <!--   <tr>
            <td>DOB</td>
            <td>
                <input type="date" name="DOB" placeholder="YYYY-MM-DD" required 
pattern="(?:19|20)[0-9]{2}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-9])|(?:(?!02)(?:0[1-9]|1[0-2])-(?:30))|(?:(?:0[13578]|1[02])-31))" 
title="Enter a date in this format YYYY-MM-DD"/>
            </td>
        </tr> -->
        <tr>
            <td>E-Mail</td>
            <td>
                <input name="email" type="email" required>
            </td>
        </tr>
        <tr>
            <td>Phone no</td>
            <td>
                <input name="phoneno" type="number" title="#####-#####" pattern="\d{5}-\d{5}" required>
            </td>
        </tr>
        <tr>
            <td>Password</td>
            <td>
                <input name="password" type="password" required>
            </td>
        </tr>
        <tr>
            <td>City</td>
            <td>
                <input name="city" type="text" required>
            </td>
        </tr>
        <tr>
            <td>State</td>
            <td>
                <input name="state" type="text" required>
            </td>
        </tr>
        <tr>
            <td> &nbsp; </td>
            <td>
                <button id="registerbtn" type="submit">Register</button>
            </td>
        </tr>
        <p>${message}</p>
    </table>
</form>
</body>
</html>