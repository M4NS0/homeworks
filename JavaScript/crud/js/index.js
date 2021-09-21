const contactContainer = document.querySelector('#contact-container');
const contactsURL = `http://localhost:3000/contacts`
const contactForm = document.querySelector('#contact-form');
let allContacts = [];

document.addEventListener('DOMContentLoaded', function () {
  fetch(`${contactsURL}`)
    .then(response => response.json())
    .then(contactData => contactData.forEach(function (contact) {
      contactContainer.innerHTML += `
      <div id=${contact.id} style="min-width:300px; width: auto;height: auto;padding:20px; margin-top:30px; ">
      <div style="border: .5px solid rgb(158, 158, 158);border-radius: 8px;padding: 20px;background-color:whitesmoke;"> 
        <h3>${contact.name}</h3>
        <h4>${contact.email}</h4>
        <h4>City: ${contact.address.city}</h4>
        <button data-id="${contact.id}" id="edit-${contact.id}" data-action="edit" style="width:50px">Edit</button>
        <button data-id="${contact.id}" id="delete-${contact.id}" data-action="delete" style="width:50px">Delete</button>
        <div style="margin-bottom:20px"> </div>
        </div>
      </div>`
    }))
});


contactForm.addEventListener('submit', (e) => {
  e.preventDefault();
  const nameInput = contactForm.querySelector('#name').value;
  const emailInput = contactForm.querySelector('#email').value;
  const cityInput = contactForm.querySelector('#city').value;

  fetch(`${contactsURL}`, {
    method: 'POST',
    body: JSON.stringify({
      name: nameInput,
      email: emailInput,
      address: {
        city: cityInput
      }
    }),
    headers: {
      'Content-Type': 'application/json'
    }
  })
  .then( response => response.json())
  .then( contact => {
    allContacts.push(contact)
  })

}) // end of adding

contactContainer.addEventListener('click', (e) => {
  if (e.target.dataset.action === 'edit') {
    
    const editButton = document.querySelector(`#edit-${e.target.dataset.id}`)
    editButton.disabled = true

    const contactData = allContacts.find((contact) => {
      return contact.id == e.target.dataset.id
    })
    e.target.parentElement.innerHTML += `
      <div id='edit-contact'>
        <form id="contact-form" style="display:flex;flex-direction: column;align-content:space-between" class='form' action='index.html' method='post'>
          <input required id="edit-title" placeholder="${contactData.name}">
          <input required id="edit-author" placeholder="${contactData.email}">
          <input required id="edit-coverImage" placeholder="${contactData.address.city}">
          <input type="submit" value="Edit contact" style="margin-top:20px">
      </div>`} else if (e.target.dataset.action === 'delete') {   
        document.querySelector(`#contact-${e.target.dataset.id}`).remove()
        fetch(`${contactsURL}/${e.target.dataset.id}`, {
          method: 'DELETE',
          headers: {
            'Content-Type': 'application/json'
          }
        }).then( response => response.json())    
  }
});

fetch(`${contactsURL}`)
  .then(response => response.json())
  .then(contactData => contactData.forEach(function (contact) {
    allContacts = contactData
    contactContainer.innerHTML += `
      <div id=contact-${contact.id}>
        `
  }));
