
function buildHuman(name, sex, birthDay) {
    let human = {name: name, sex: sex}
    human.birthDay = new Date(birthDay)
    human.getAge = function () {
        return Math.floor((new Date() - new Date(this.birthDay)) / 1000 / 60 / 60 / 24 / 365)
    }
    return human;
}

function addField(human) {
    let myTable = document.getElementById("resultTable");
    let currentIndex = myTable.rows.length;
    let currentRow = myTable.insertRow(currentIndex - 2);

    currentIndex = currentIndex - 2;
    let currentCell = currentRow.insertCell(-1);
    let newText = document.createTextNode(human.name);
    currentCell.appendChild(newText);
    currentCell.setAttribute("name", "fio" + currentIndex);

    currentCell = currentRow.insertCell(-1);
    newText = document.createTextNode(human.sex);
    currentCell.appendChild(newText);
    currentCell.setAttribute("name", "sex" + currentIndex);

    currentCell = currentRow.insertCell(-1);
    newText = document.createTextNode(human.birthDay.toLocaleDateString("ru-RU"));
    currentCell.appendChild(newText);
    currentCell.setAttribute("name", "birthDay" + currentIndex);

    currentCell = currentRow.insertCell(-1);
    newText = document.createTextNode(human.getAge());
    currentCell.appendChild(newText);
    currentCell.setAttribute("name", "age" + currentIndex);
    currentCell.setAttribute("class", "AgeCell");
    sumAverageOld();
}

function sumAverageOld() {
    let sum = 0;
    let ageCellArray = document.getElementsByClassName("AgeCell");
    for (let i = 0; i < ageCellArray.length; i++) {
        sum = sum + Number(ageCellArray[i].textContent);
    }

    document.getElementsByClassName("resultAge")[0].textContent = Math.round(sum / ageCellArray.length);
}