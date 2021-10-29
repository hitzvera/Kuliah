$(document).ready(function () {
    let status = true;
    $('#icn-dark').click(function(){
        if(status){
            $('body').css('background-color', '#242526')
            $('.bg-dk').css('background-color','#3a3b3c')
            $('.txt-white').css('color', 'white')
            $('#icn-dark').html('<i class="fas fa-sun txt-white icon"></i>')
            status = false
        } else {
            $('body').css('background-color', 'white')
            $('.bg-dk').css('background-color','white')
            $('.txt-white').css('color', 'black')
            $('#icn-dark').html('<i class="fas fa-moon txt-white icon"></i>')
            status = true
        }
        
    })
 });