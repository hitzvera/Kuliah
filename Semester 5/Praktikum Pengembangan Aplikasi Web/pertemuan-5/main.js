function insert(num) {
    $('.cal-display').val($('.cal-display').val() + num) 
}
function persen (num) {
    $('.cal-display').val($('.cal-display').val() + num) 
}
function equal(){
    $('.cal-display').val(eval($('.cal-display').val()))
}
function del(){
    $('.cal-display').val('')
}