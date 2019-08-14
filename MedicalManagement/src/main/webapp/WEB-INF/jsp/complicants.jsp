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
<form action="ComplicantProcess" method="post">
    <h1>REGISTER FOR APPOINTMENT</h1>

    <table class="center">
        <tr>
            <td>ID</td>
            <td>
                <input name="id" id="nameip" type="number" required>
            </td>
        </tr>
        <tr>
            <td>NAME</td>
            <td>
                <input name="uname" id="passip" type="text" required>
            </td>
        </tr>
        <tr>
            <td>COMPLICATION</td>
            <td>
                <input name="complicant" id="nameip" type="text" required>
            </td>
        </tr>
        <tr>
            <td>Choose doctor</td>
            <td>
                <input name="doctorName" id="docip" type="text" required>
            </td>
        </tr>
        <tr>
            <td>Enter doctor id</td>
            <td>
                <input name="doctorId" id="docid" type="number" required>
            </td>
        </tr>
        <tr>
            <td> &nbsp; </td>
            <td>
                <button id="submitBtn" type="submit">SUBMIT</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>