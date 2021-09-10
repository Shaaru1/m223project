const form = documnet.getElementById('form');
const form = document.gegElementById('email');
const form = document.gegElementById('password');
const form = document.gegElementById('password2');

form.addEventListener('submit', (e) => {
    e.preventDefault();

    checkInputs();
});

function checkInputs() {
    const emailValue = email.value.trim();
    const passwordValue = password.value.trim();
    const password2Value = password2.value.trim();

    if(emailValue === '' ) {
        setErrorFor(email, 'Email cannot be blank');
    }

}