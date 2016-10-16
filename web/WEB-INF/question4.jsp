<html>
    <head>
        <script type="text/javascript">

// Elegxos gia to ean exoun pati8ei ola ta koumpia
            function next() {
                var notvalid = [];
                notvalid[0] = (document.forms["form4"]["q10"].value === "");
                notvalid[1] = (document.forms["form4"]["q11"].value === "");
                notvalid[2] = (document.forms["form4"]["q12"].value === "");
                if (notvalid[0] || notvalid[1] || notvalid[2]) {
                    var alerts = document.getElementsByClassName("validation");
                    for (var i = 0; i < alerts.length; i++) {
                        alerts[i].style.display = "none";
                        if (notvalid[i]) {
                            console.log(alerts[i]);
                            alerts[i].style.display = "inline";
                        }
                    }
                    return false;
                }
            }
//            

        </script>
        <style>
            .validation {
                display: none;
                color: red;
            }
        </style>

    </head>
    <body>
        <form name="form4" action="Servlet4" method="POST">
            <label> Q10 </label><br />
            <input type="radio" name="q10" value="a1"> a1<br />
            <input type="radio" name="q10" value="a2"> a2<br />
            <input type="radio" name="q10" value="a3"> a3
            <br />
            <span class="validation">You must choose an answer before submitting.<br /></span>

            <label> Q11 </label><br />
            <input type="radio" name="q11" value="a1"> a1<br />
            <input type="radio" name="q11" value="a2"> a2<br />
            <input type="radio" name="q11" value="a3"> a3
            <br />
            <span class="validation">You must choose an answer before submitting.<br /></span>

            <label> Q12 </label><br />
            <input type="radio" name="q12" value="a1"> a1<br />
            <input type="radio" name="q12" value="a2"> a2<br />
            <input type="radio" name="q12" value="a3"> a3
            <br />
            <span class="validation">You must choose an answer before submitting.<br /></span>
            <button type="button" name="back" onclick="history.back()">Back</button>
            <input type="submit" name="Btn" value="Submit" onclick="return next();"><br>
            <input type="submit" name="Btn" value="Exit">
        </form> 
        <script>
// Elegxos gia to ean exoun pati8ei ola ta koumpia

            var answer10 = "${sessionScope.dataBean.getA(9)}";
            var answer11 = "${sessionScope.dataBean.getA(10)}";
            var answer12 = "${sessionScope.dataBean.getA(11)}";
            console.log(answer10);
            console.log(answer11);
            console.log(answer12);

            if (answer10 === "a1" || answer10 === "a2" || answer10 === "a3") {
                for (i = 0; i < 3; i++) {
                    if (answer10 === document.form4.q10[i].value) {
                        document.form4.q10[i].checked = true;
                    }
                    ;
                }
                ;
            }
            ;
            if (answer11 === "a1" || answer11 === "a2" || answer11 === "a3") {
                for (i = 0; i < 3; i++) {
                    if (answer11 === document.form4.q11[i].value) {
                        document.form4.q11[i].checked = true;
                    }
                    ;
                }
                ;
            }
            ;
            if (answer12 === "a1" || answer12 === "a2" || answer12 === "a3") {
                for (i = 0; i < 3; i++) {
                    if (answer12 === document.form4.q12[i].value) {
                        document.form4.q12[i].checked = true;
                    }
                    ;
                }
                ;
            }
            ;
//
        </script>
    </body>
</html>	