document.getElementById('myForm').addEventListener('submit', async function(event) {
    event.preventDefault();

    const name = document.getElementById('email').value;
    const email = document.getElementById('password').value;

    const formData = { email,password };

    const response = await fetch('/app/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(formData)
    });
    const responseData = await response.json();

        const messageElement = document.getElementById('message');

        if (response.ok) {
            messageElement.textContent = responseData.message;
            // Redirect or perform other actions on successful login
        } else {
            messageElement.textContent = responseData.message;
        }


});


