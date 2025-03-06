function getStudent(id){


    if(document.getElementById("student"+id).innerText==""){

        //get the student object from the web service URL
        fetch('http://localhost:8080/students/'+ id).
        then(student => student.json()) //JSONify the data returned
            .then(function(student){ // with the JSON DATA
                var textToDisplay = "";
                textToDisplay += "ID : " + student.id + "<br>";
                textToDisplay += "NAME: " +student.name + "<br>";
                textToDisplay += "GRADE: "+ student.grade + "<br>";
                textToDisplay += "LETTER GRADE: " + student.letterGrade + "<br>";
                document.getElementById('student' + id).innerHTML = textToDisplay;

            })

    }
    else{
        document.getElementById("student"+id).innerHTML="";
    }
}