<%@page import="hua.gr.DataBean"%>
<html>
    <head>
        <script type="text/javascript">
// Elegxos gia to ean exoun pati8ei ola ta koumpia
            function next() {
                var notvalid = [];
                notvalid[0] = (document.forms["form1"]["q1"].value === "");
                notvalid[1] = (document.forms["form1"]["q2"].value === "");
                notvalid[2] = (document.forms["form1"]["q3"].value === "");
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
        <form name="form1" action="Servlet1"  method="POST">
            <label> Q1 </label><br />
            <input type="radio" name="q1" value="a1"> a1<br />
            <input type="radio" name="q1" value="a2"> a2<br />
            <input type="radio" name="q1" value="a3"> a3
            <br />
            <span class="validation">You must choose an answer before submiting.<br /></span>

            <label> Q2 </label><br />
            <input type="radio" name="q2" value="a1"> a1<br />
            <input type="radio" name="q2" value="a2"> a2<br />
            <input type="radio" name="q2" value="a3"> a3
            <br />
            <span class="validation">You must choose an answer before submiting.<br /></span>

            <label> Q3 </label><br />
            <input type="radio" name="q3" value="a1"> a1<br />
            <input type="radio" name="q3" value="a2"> a2<br />
            <input type="radio" name="q3" value="a3"> a3
            <br />
            <span class="validation">You must choose an answer before submiting.<br /></span>

            <input type="submit" name= "Btn" value="Next" onclick="return next();"><br>
            <input type="submit" name= "Btn" value="Exit">
        </form> 
        <script>
//Elegxos gia to ean yparxei kati sto bean na to valei sta radio buttons

            var answer1 = "${sessionScope.dataBean.getA(0)}";
            var answer2 = "${sessionScope.dataBean.getA(1)}";
            var answer3 = "${sessionScope.dataBean.getA(2)}";
            if (answer1 === "a1" || answer1 === "a2" || answer1 === "a3") {
                for (i = 0; i < 3; i++) {
                    if (answer1 === document.form1.q1[i].value) {
                        document.form1.q1[i].checked = true;
                    }
                    ;
                }
                ;
            }
            ;
            if (answer2 === "a1" || answer2 === "a2" || answer2 === "a3") {
                for (i = 0; i < 3; i++) {
                    if (answer2 === document.form1.q2[i].value) {
                        document.form1.q2[i].checked = true;
                    }
                    ;
                }
                ;
            }
            ;
            if (answer3 === "a1" || answer3 === "a2" || answer3 === "a3") {
                for (i = 0; i < 3; i++) {
                    if (answer3 === document.form1.q3[i].value) {
                        document.form1.q3[i].checked = true;
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