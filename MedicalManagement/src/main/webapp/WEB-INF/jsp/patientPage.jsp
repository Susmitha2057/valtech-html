<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>PATIENT PAGE</title>
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
    	<form action="PersonalDetails" method="post">
        <button id="btn" onclick="location.href='personalDetails'">PERSONAL DETAILS</button><br>
        </form>
        <button id="btn" onclick="location.href='complicants'">COMPLICANTS</button><br>
        <form action="PatientReport" method="post"> 
        <button id="btn" type="submit">PATIENT'S REPORT</button><br>
        </form>
        <button id="btn" onclick="location.href='response'">RESPONSE FROM DOCTOR</button><br>
        <button id="btn" onclick="location.href='HomePage'">LOGOUT</button><br>
    </div>

</body>

</html>