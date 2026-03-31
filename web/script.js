document.getElementById("myForm").addEventListener("submit", function(event) {
    event.preventDefault();

    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let message = document.getElementById("message");

    if (name === "" || email === "") {
        message.style.color = "red";
        message.innerText = "All fields are required!";
    } else {
        message.style.color = "green";
        message.innerText = "Form submitted successfully!";
    }
});