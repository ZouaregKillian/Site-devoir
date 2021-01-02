
const navItems = [
  {
    label: "Acceuil",
    href: "/",
  },
  {
    label: "A&nbsp;propos",
    href: "/about",
  },
  {
    label: "Connexion",
    href: "/login",
  },
  {
    label: "Magasin",
    href: "/shop",
  },
  {
    label: "Blog",
    href: "/blog",
  },
  {
    label: "Partenaires",
    href: "/partners",
  },
  {
    label: "Equipe",
    href: "/tems",
  },
];







function navBar(){

  const bodyDomNode = document.querySelector("body");
  let template =`
  <nav>
       ​<ul>
       ​</ul>
  ​</nav>`
  bodyDomNode.innerHTML = template;

  const navDomNode = document.querySelector("nav ul");

  for(let i = 0; i < navItems.length; i++){
    navDomNode.innerHTML += `<li class="nav-item">
    ​                        <a href="${navItems[i].href} " class="nav-item-link">${navItems[i].label}</a>
​                            </li>`
};
}

navBar();






