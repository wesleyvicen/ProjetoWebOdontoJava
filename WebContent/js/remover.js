document.addEventListener('click', function (e) {
    if (e.target.className == 'remover') {
        var confirmacao = confirm('Deseja realmente remover este item?')
        if (confirmacao) {
            e.target.parentNode.remove();
        }
    }

});
