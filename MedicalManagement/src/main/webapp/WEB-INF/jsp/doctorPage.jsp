<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>DOCTOR PAGE</title>
    <style>
        body {
            text-align: center;
            background-color: aliceblue;
        }

        #btn {
            padding: 10px;
            margin: 15px;
            width: 400px;
            height: 50px;
            background-color: aquamarine;
            color: darkblue;
            font-size: 22px;
        }

        #btn:hover {
            background-color: cornflowerblue;
        }
    </style>
</head>

<body>
    <div class="container">
        <button id="btn" onclick="location.href='docPersonalDetails.jsp'">PERSONAL DETAILS</button><br>
        <button id="btn" onclick="location.href='updateReport.jsp'">UPDATE PATIENT'S REPORT</button><br>
        <button id="btn" onclick="location.href='patientRequest.jsp'">PATIENT'S REQUEST</button><br>
        <button id="btn" onclick="location.href='HomePage.jsp'">LOGOUT</button><br>
    </div>
</body>

</html>