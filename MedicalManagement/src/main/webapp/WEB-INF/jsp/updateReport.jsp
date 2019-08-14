<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>patient page</title>
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
<form action="updateProcess" method="post">
    <h1>UPDATE PATIENT REPORT</h1>

    <table class="center">
        <tr>
            <td>PATIENT'S ID</td>
            <td>
                <input name="patientid" id="p_id" type="number" required>
            </td>
        </tr>
        <tr>
            <td>DOCTOR'S ID</td>
            <td>
                <input name="doctorid" id="d_id" type="number" required>
            </td>
        </tr>
        <tr>
            <td>PRESCRIPTION</td>
            <td>
                <input name="prescription" id="prescription" type="text" required>
            </td>
        </tr>
        <tr>
            <td> &nbsp; </td>
            <td>
                <button id="submitBtn" type="submit" onclick="location.href='doctorPage'">SUBMIT</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>