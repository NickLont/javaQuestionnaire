<html>
    <head>
        <script type="text/javascript">
            
// Elegxos gia to ean exoun pati8ei ola ta koumpia
            function next() {
                var notvalid = [];
                notvalid[0] = (document.forms["form2"]["q4"].value === "");
                notvalid[1] = (document.forms["form2"]["q5"].value === "");
                notvalid[2] = (document.forms["form2"]["q6"].value === "");
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
        <form name="form2" action="Servlet2"  method="POST">
            <label> Q4 </label><br />
            <input type="radio" name="q4" value="a1"> a1<br />
            <input type="radio" name="q4" value="a2"> a2<br />
            <input type="radio" name="q4" value="a3"> a3
            <br />
            <span class="validation">You must choose an answer before submitting.<br /></span>

            <label> Q5 </label><br />
            <input type="radio" name="q5" value="a1"> a1<br />
            <input type="radio" name="q5" value="a2"> a2<br />
            <input type="radio" name="q5" value="a3"> a3
            <br />
            <span class="validation">You must choose an answer before submitting.<br /></span>

            <label> Q6 </label><br />
            <input type="radio" name="q6" value="a1"> a1<br />
            <input type="radio" name="q6" value="a2"> a2<br />
            <input type="radio" name="q6" value="a3"> a3
            <br />
            <span class="validation">You must choose an answer before submitting.<br /></span>
            <button type="button" name="back" onclick="history.back()">Back</button>
            <input type="submit" name="Btn" value="Next" onclick="return next();"><br>
            <input type="submit" name="Btn" value="Exit">
        </form> 
        <script>
            
// Elegxos gia to ean exoun pati8ei ola ta koumpia            

            var answer4 = "${sessionScope.dataBean.getA(3)}";
            var answer5 = "${sessionScope.dataBean.getA(4)}";
            var answer6 = "${sessionScope.dataBean.getA(5)}";
            if (answer4 === "a1" || answer4 === "a2" || answer4 === "a3") {
                for (i = 0; i < 3; i++) {
                    if (answer4 === document.form2.q4[i].value) {
                        document.form2.q4[i].checked = true;
                    }
                    ;
                }
                ;
            }
            ;
            if (answer5 === "a1" || answer5 === "a2" || answer5 === "a3") {
                for (i = 0; i < 3; i++) {
                    if (answer5 === document.form2.q5[i].value) {
                        document.form2.q5[i].checked = true;
                    }
                    ;
                }
                ;
            }
            ;
            if (answer6 === "a1" || answer6 === "a2" || answer6 === "a3") {
                for (i = 0; i < 3; i++) {
                    if (answer6 === document.form2.q6[i].value) {
                        document.form2.q6[i].checked = true;
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