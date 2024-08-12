var currentUrl = window.location.href;

    var navbarLinks = document.querySelectorAll('#navbar a');

    navbarLinks.forEach(function (link) {
        if (link.href === currentUrl) {
            
            link.classList.add('active');
        }
    });