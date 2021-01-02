#### *RÉFÉRENTIEL*    
* Activité type : 1. Front-end
* Compétences pro : 3. Développer une interface utilisateur web dynamique

#### *OBJECTIFS PÉDAGOGIQUES*   
* nommage & types
* fonctions fléchées ou non
* affectation & réaffectation
* opérateurs de comparaisons & conditions
* DOM binding & gestion d'événements
* Appel de fonction & DOM construction methods
* Template littéral & interpolation

___________

# LE FORMULAIRE DE PRÉCISION

    Un nouveau client possède déjà une plateforme de Jobbying qui permet de s'échanger des services moyennant argent.

    Ce client a besoin d'une page qui permet à l'utilisateur de préciser un certain nombre d'informations sur une demande de transport le concernant.

    Il a besoin de générer cette page pour un nombre indéfini de catégories de demande utilisateur. Toutes ces catégories étant différentes, le formulaire doit être résilient. C'est à dire qu'il doit permettre d'afficher n'importe quelle nombre de questions, n'importe quelles réponses préderterminées à ces questions, et n'importe quel input adéquat par rapport à chaque question.

    Heureusement, vous possèdez déjà un échantillon de données à traiter, et qui sert de modèle.



### *SOLUTION DÉTAILLÉE*



### *AMÉLIORATIONS* : 



### *OUTILS NÉCÉSSAIRES* : 


### *CODE*
    const data = {
    categoryLabel: "Transport",
    questions: [
        {
            id: 1,
            code: 12456789,
            order: 1000,
            archived: false,
            type: "text",
            label: "Qu'avez-vous besoin de transporter ?",
            responses: []
        },
        {
            id: 2,
            code: 142567945,
            order: 2000,
            archived: false,
            type: "radio",
            label: "Quel est le poids de cet objet ?",
            responses: [
                {
                    id: 2,
                    code: 243164578,
                    order: 1000,
                    archived: false,
                    name: "weight",
                    label: "Très léger"
                },
                {
                    id: 3,
                    code: 431645745,
                    order: 2000,
                    archived: false,
                    name: "weight",
                    label: "Léger"
                },
                {
                    id: 4,
                    code: 34664315,
                    order: 3000,
                    archived: false,
                    name: "weight",
                    label: "Lourd"
                },
                {
                    id: 5,
                    code: 436694557,
                    order: 4000,
                    archived: false,
                    name: "weight",
                    label: "Très Lourd"
                },
            ]
        },
        {
            id: 3,
            code: 134675495,
            order: 3000,
            archived: false,
            type: "select",
            label: "De quelle taille est cet objet ?",
            responses: [
                {
                    id: 5,
                    code: 243164578,
                    order: 1000,
                    archived: false,
                    name: "veryLittle",
                    label: "Très petit"
                },
                {
                    id: 6,
                    code: 431645745,
                    order: 2000,
                    archived: false,
                    name: "little",
                    label: "Petit"
                },
                {
                    id: 7,
                    code: 34664315,
                    order: 3000,
                    archived: false,
                    name: "big",
                    label: "Grand"
                },
                {
                    id: 8,
                    code: 436694557,
                    order: 4000,
                    archived: false,
                    name: "veryBig",
                    label: "Très Grand"
                },
            ]
        },
        {
            id: 4,
            code: 143764578,
            order: 4000,
            archived: false,
            type: "date",
            label: "À quelle date avez-vous besoin de transporter cet objet ?",
            responses: []
        },
        {
            id: 5,
            code: 431645724,
            order: 5000,
            archived: false,
            type: "checkbox",
            label: "Quelle créneau horaire vous conviendrait ?",
            responses: [
                {
                    id: 9,
                    code: 436694557,
                    order: 1000,
                    archived: false,
                    name: "morning",
                    label: "08h00 - 12h00"
                },
                {
                    id: 10,
                    code: 436694557,
                    order: 2000,
                    archived: false,
                    name: "noon",
                    label: "12h00 - 14h00"
                },
                {
                    id: 11,
                    code: 436694557,
                    order: 3000,
                    archived: false,
                    name: "afternoon",
                    label: "14h00 - 18h00"
                },
                {
                    id: 12,
                    code: 436694557,
                    order: 4000,
                    archived: false,
                    name: "evening",
                    label: "18h00 - 20h00"
                },
            ]
        },
        {
            id: 5,
            code: 431645724,
            order: 5000,
            archived: false,
            type: "textarea",
            label: "Avez-vous quelque chose à ajouter ?",
            responses: []
        }
        ]
    }
    
   












































        
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <meta http-equiv="X-UA-Compatible" content="ie=edge">
            <!-- STYLESHEETS -->
            <link rel="stylesheet" href="../assets/style/reset.css">
            <link rel="stylesheet" href="../assets/style/question.css">
            <!-- FONT-AWESOME -->
            <script src="https://kit.fontawesome.com/f108d59f30.js"></script>
            <title>Jobby</title>
        </head>

        <body>
            <header>
                <a href='./index.html' id='brand'>
                    <h1>Jobby</h1>
                </a>
                <i id="nav-icon" class="fas fa-bars nav-icon-close"></i>
                <nav id="nav" class="nav-close">
                    <a href="./categories.html">Nos offres</a>
                    <a href="./login.html">Connexion</a>
                    <a href="./about.html">À&nbsp;propos</a>
                    <a href="./contact.html">Contact</a>
                    <a href="./partners.html">Nos partenaires</a>
                </nav>
            </header>
            <form action="">
                <h2>Quelques questions pour affiner votre recherche</h2>
                <h3>Service seletionné : Transport</h3>
                <input type="hidden" value="transport" name="transport" id="transport">
                <section class="question-ctn">
                    <h3>Qu'avez-vous besoin de transporter ?</h3>
                    <div class="question-ctn">
                        <input type="text" name="type" id="type">
                    </div>
                </section>
                <section class="question-ctn">
                    <h3>Quel est le poids de cet objet ?</h3>
                    <div class="question-box">
                        <input type="radio" name="weight" id="veryLight">
                        <label for="veryLight">Très léger</label>

                    </div>
                    <div class="question-box">
                        <input type="radio" name="weight" id="light">
                        <label for="light">léger</label>

                    </div>
                    <div class="question-box">
                        <input type="radio" name="weight" id="heavy">
                        <label for="heavy">Lourd</label>

                    </div>
                    <div class="question-box">
                        <input type="radio" name="weight" id="veryHeavy">
                        <label for="veryHeavy">Très lourd</label>

                    </div>
                </section>
                <section class="question-ctn">
                    <div class="question-box">
                        <h3>De quelle taille est cet objet ?</h3>
                        <select name="volume" id="volume">
                            <option value="select">Sélectionnez</option>
                            <option value="veryLittle">Très petit</option>
                            <option value="little">Petit</option>
                            <option value="big">Grand</option>
                            <option value="veryBig">Très grand</option>

                        </select>
                    </div>
                </section>
                <section class="question-ctn">
                    <h3>À quelle date avez-vous besoin de transporter cet objet ?</h3>
                    <div class="question-box">
                        <input type="date" name="date" id="date">
                    </div>
                </section>
                <section class="question-ctn">
                    <h3>Quelle créneau horaire vous conviendrait ?</h3>
                    <div class="question-box">
                        <input type="checkbox" name="morning" id="morning">
                        <label for="morning">08h00 - 12h00</label>

                    </div>
                    <div class="question-box">
                        <input type="checkbox" name="noon" id="noon">
                        <label for="noon">12h00 - 14h00</label>

                    </div>
                    <div class="question-box">
                        <input type="checkbox" name="afternoon" id="afternoon">
                        <label for="afternoon">14h00 - 18h00</label>

                    </div>
                    <div class="question-box">
                        <input type="checkbox" name="evening" id="evening">
                        <label for="evening">18h00 - 20h00</label>

                    </div>
                </section>
                <section class="question-ctn">
                    <h3>Avez-vous quelque chose à suggérer ?</h3>
                    <div class="question-box">
                    <textarea name="suggestion" id="suggestion"></textarea>
                    </div>
                </section>
                <div class="question-ctn">
                    <input type="submit" value="Confirmer">
                </div>

            </form>

            <footer>
                <i class="fab fa-facebook-f"></i>
                <i class="fab fa-twitter"></i>
                <i class="far fa-copyright"></i>
                <i class="fas fa-cookie"></i>
            </footer>
        </body>


        </html>