let employees, info;

async function init(){
  // JSON data retrieval process  
  let link = "https://sturdy-invention-4jv74rpggp97f74p6-8500.app.github.dev"; //replace with your specific link (Make it public)
  // The URL above must be running in a separate broswer tab. (Alternate use: http://localhost:8500 )
  let route= "/employees";

  info = await fetch(link+route);
  employees = await info.json();

  console.log(employees); // confirm data retrieval

  // call the function (from Problem 1) to generate the cards
  generateCards(employees);
}

// Problem 1: Create a function that builds a card for each employee using the div with a class of 'card'.
// Each card should contain the employee ID, first name, last name, and title.
// Make the main output div with id of 'output' be a flex container using CSS. 
function generateCards(employees){

  let output = document.getElementById("output");
  let build = "";
  for(let i=0;i<employees.length;i++){
    build +=`<div class="fitted card">`;
    build +=`   <h2>Employee ID: ${employees[i].EmployeeId}`;
    build +=`   <p>Name: ${employees[i].FirstName} ${employees[i].LastName}`;
    build +=`   <h3>${employees[i].Title}`;
    build +=`</div>`;
  }
  output.innerHTML = build;



  // Problem 2: Add CSS Styling to style the info cards.
  // in style.css
  
//   #output{
//   display:flex;
//   flex-wrap:wrap;
// }


}