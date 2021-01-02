const data = {
    categoryLabel: "Transport",
    questions: [{
            id: 1,
            code: 12456789,
            order: 1000,
            archived: false,
            type: "text",
            label: "Qu'avez-vous besoin de transporter ?",
            responses: [],
        },
        {
            id: 2,
            code: 142567945,
            order: 2000,
            archived: false,
            type: "radio",
            label: "Quel est le poids de cet objet ?",
            responses: [{
                    id: 2,
                    code: 243164578,
                    order: 1000,
                    archived: false,
                    name: "weight",
                    label: "Très léger",
                },
                {
                    id: 3,
                    code: 431645745,
                    order: 2000,
                    archived: false,
                    name: "weight",
                    label: "Léger",
                },
                {
                    id: 4,
                    code: 34664315,
                    order: 3000,
                    archived: false,
                    name: "weight",
                    label: "Lourd",
                },
                {
                    id: 5,
                    code: 436694557,
                    order: 4000,
                    archived: false,
                    name: "weight",
                    label: "Très Lourd",
                },
            ],
        },
        {
            id: 3,
            code: 134675495,
            order: 3000,
            archived: false,
            type: "select",
            label: "De quelle taille est cet objet ?",
            responses: [{
                    id: 5,
                    code: 243164578,
                    order: 1000,
                    archived: false,
                    name: "veryLittle",
                    label: "Très petit",
                },
                {
                    id: 6,
                    code: 431645745,
                    order: 2000,
                    archived: false,
                    name: "little",
                    label: "Petit",
                },
                {
                    id: 7,
                    code: 34664315,
                    order: 3000,
                    archived: false,
                    name: "big",
                    label: "Grand",
                },
                {
                    id: 8,
                    code: 436694557,
                    order: 4000,
                    archived: false,
                    name: "veryBig",
                    label: "Très Grand",
                },
            ],
        },
        {
            id: 4,
            code: 143764578,
            order: 4000,
            archived: false,
            type: "date",
            label: "À quelle date avez-vous besoin de transporter cet objet ?",
            responses: [],
        },
        {
            id: 5,
            code: 431645724,
            order: 5000,
            archived: false,
            type: "checkbox",
            label: "Quelle créneau horaire vous conviendrait ?",
            responses: [{
                    id: 9,
                    code: 436694557,
                    order: 1000,
                    archived: false,
                    name: "morning",
                    label: "08h00 - 12h00",
                },
                {
                    id: 10,
                    code: 436694557,
                    order: 2000,
                    archived: false,
                    name: "noon",
                    label: "12h00 - 14h00",
                },
                {
                    id: 11,
                    code: 436694557,
                    order: 3000,
                    archived: false,
                    name: "afternoon",
                    label: "14h00 - 18h00",
                },
                {
                    id: 12,
                    code: 436694557,
                    order: 4000,
                    archived: false,
                    name: "evening",
                    label: "18h00 - 20h00",
                },
            ],
        },
        {
            id: 5,
            code: 431645724,
            order: 5000,
            archived: false,
            type: "textarea",
            label: "Avez-vous quelque chose à ajouter ?",
            responses: [],
        },
    ],
};


const bodyDomNode = document.querySelector("body form")

let finalTemplate = ``;

finalTemplate += ` 
  <h2>Quelques questions pour affiner votre recherche</h2>
  <h3>Service selectionné : ${data.categoryLabel}</h3>
  `;

for (i = 0; i < data.questions.length; i++) {

    let question = data.questions[i];
    let questionLabel = question.label

    let templateSection = `
    <section class="question-ctn">
        <h3>${questionLabel}</h3> 
    `;


    if (question.type === "text" || question.type === "date") {
        templateSection += `
        <div class="question-box">
            <input type ="${question.type}"></input>
        </div>`
    }

    if (question.type === "textarea") {
        templateSection += `
        <div class ="question-box"></div>
        <${question.type}></${question.type}>
        </div>
        `
    }
    let responses = question.responses;
    let responseLabel = responses.label;
    if (question.type === "radio") {

        for (j = 0; j < responses.length; j++) {

            templateSection += `
            <div class="question-box">
                    <input type="${question.type}" name="${responses[j].name}" id="${responses[j].id}">
                    <label for="veryLight">${responses[j].label}</label>
            </div>
            `
        }

    }

    if (question.type === "select") {

        templateSection += `
        <select name="volume" id="volume">
        <option value="select">Sélectionnez</option>
        `

        for (k = 0; k < responses.length; k++) {
            templateSection += `
            <option value="${responses[k].name}">${responses[k].label}</option>  
            `
        }

        templateSection += `
        </select>
        `
    }

    if (question.type === "checkbox") {
        for (g = 0; g < responses.length; g++) {
            templateSection += `
        <div class="question-box">
            <input type="${question.type}" name="${responses[g].name}" id="${responses[g].name}">
            <label for="morning">${responses[g].label}</label>

        </div>
        `

        }

    }


    finalTemplate += templateSection;
    finalTemplate += "</section>";

}



bodyDomNode.innerHTML = finalTemplate;