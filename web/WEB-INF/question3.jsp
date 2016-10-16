<html>
    <head>
        <script type="text/javascript">
            
// Elegxos gia to ean exoun pati8ei ola ta koumpia
            function next() {
                var notvalid = [];
                notvalid[0] = (document.forms["form3"]["q7"].value === "");
                notvalid[1] = (document.forms["form3"]["q8"].value === "");
                notvalid[2] = (document.forms["form3"]["q9"].value === "");
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
        <form name="form3" action="Servlet3" method="POST">
            <label> Q7 </label><br />
            <input type="radio" name="q7" value="a1"> a1<br />
            <input type="radio" name="q7" value="a2"> a2<br />
            <input type="radio" name="q7" value="a3"> a3
            <br />
            <span class="validation">You must choose an answer before submitting.<br /></span>

            <label> Q8 </label><br />
            <input type="radio" name="q8" value="a1"> a1<br />
            <input type="radio" name="q8" value="a2"> a2<br />
            <input type="radio" name="q8" value="a3"> a3
            <br />
            <span class="validation">You must choose an answer before submitting.<br /></span>

            <label> Q9 </label><br />
            <input type="radio" name="q9" value="a1"> a1<br />
            <input type="radio" name="q9" value="a2"> a2<br />
            <input type="radio" name="q9" value="a3"> a3
            <br />
            <span class="validation">You must choose an answer before submitting.<br /></span>
            <button type="button" name="back" onclick="history.back()">Back</button>
            <input type="submit" name="Btn" value="Next" onclick="return next();"><br>
            <input type="submit" name="Btn" value="Exit">
        </form> 
        <script>
// Elegxos gia to ean exoun pati8ei ola ta koumpia

            var answer7 = "${sessionScope.dataBean.getA(6)}";
            var answer8 = "${sessionScope.dataBean.getA(7)}";
            var answer9 = "${sessionScope.dataBean.getA(8)}";
            if (answer7 === "a1" || answer7 === "a2" || answer7 === "a3") {
                for (i = 0; i < 3; i++) {
                    if (answer7 === document.form3.q7[i].value) {
                        document.form3.q7[i].checked = true;
                    }
                    ;
                }
                ;
            }
            ;
            if (answer8 === "a1" || answer8 === "a2" || answer8 === "a3") {
                for (i = 0; i < 3; i++) {
                    if (answer8 === document.form3.q8[i].value) {
                        document.form3.q8[i].checked = true;
                    }
                    ;
                }
                ;
            }
            ;
            if (answer9 === "a1" || answer9 === "a2" || answer9 === "a3") {
                for (i = 0; i < 3; i++) {
                    if (answer9 === document.form3.q9[i].value) {
                        document.form3.q9[i].checked = true;
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