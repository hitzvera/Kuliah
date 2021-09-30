
let indexEdit; // buat ngasih nanti input.value
let statusButton = true; // gantt tombol tambah menjadi update ketika mencet edit
let increamentId = 1; // untuk key dari object localStorage

// default untuk button tambah
let btnTambah = document.getElementById('btn-tambah')
btnTambah.innerHTML = "Tambah"

// variable cari 
let cariList = document.getElementById('cariList')
cariList.addEventListener('keyup', function(){
    // membuat variable untuk mendapatkan value dari input
    let cariValue = cariList.value.toLowerCase()

    let hasilCari = document.getElementById('todoList')
    let Hasiltr = hasilCari.querySelectorAll('tr.barisTabel')
    
    for(let i = 0; i < Hasiltr.length;i++){
        let a = Hasiltr[i].getElementsByTagName('td')[1];
        if(a.innerHTML.toLowerCase().indexOf(cariValue) > -1){
            Hasiltr[i].style.display = "table-row"
        } else {
            Hasiltr[i].style.display = "none"
        }
    }
})

function showData() {
    
    const tabel = document.getElementById('todoList')
    tabel.innerHTML = `<tr>
                            <th>No</th>
                            <th>Kegiatan</th>
                            <th>Action</th>
                        </tr>`
    
    for(let i=0;i < localStorage.length;i++) {
        let btnEdit = "<button class='btn edit' onclick='edit(" + i + ")'><i class='fa-solid fa-pencil'></i></button>"
        let btnHapus = "<button class='btn hapus' onclick='hapus(" + i +")'><i class='fa-solid fa-xmark'></i></button>"
        let no = i+1

        tabel.innerHTML += "<tr class='barisTabel active-row'><td class='changeDark'>"+no+"</td><td class='changeDark'>"+localStorage.getItem(localStorage.key(i))+"</td><td class='changeDark'>"+btnEdit+btnHapus+"</td><tr>"
    }
}

function tambah(index) {
    
    if(statusButton){
        let inputKegiatan = document.getElementById('input-kegiatan').value
        localStorage.setItem(increamentId,inputKegiatan)
        increamentId++
        document.getElementById('input-kegiatan').value = ''
    } 
    
    else {
        localStorage.setItem(localStorage.key(index), document.getElementById('input-kegiatan').value)
        statusButton = true
        btnTambah.innerHTML = "Tambah"
        document.getElementById('input-kegiatan').value = ''
    }
    showData()
}

function edit(index) {
    let inputKegiatan = document.getElementById('input-kegiatan')
    inputKegiatan.value = localStorage.getItem(localStorage.key(index))
    indexEdit = index
    btnTambah.innerHTML = "Update"
    statusButton = false;

    showData() 
}

function hapus(index) {
    localStorage.removeItem(localStorage.key(index))
    showData();
}

let resetBtn = document.getElementById('reset')
resetBtn.addEventListener('click',function(){
    if(confirm('Apakah anda yakin akan menghapus semua data Anda')) {
        localStorage.clear()
        document.location.reload(true)
        increamentId = 1
    }
    
})
let darkModeStatus = true
const darkModeButton = document.querySelector('.dark-mode')
const textTable = document.querySelectorAll('.changeDark')
function darkMode(status) {
    if(status) {
        document.body.style.backgroundColor = "#fafafa"
        darkModeButton.innerHTML = "<i class='fa-solid fa-moon fa-2x'></i>"
        darkModeButton.style.color = "white"
        darkModeButton.style.backgroundColor = "black"
        // textTable.style.color = "black"
        document.body.style.color = "black"
        darkModeStatus = false
    } else {
        document.body.style.backgroundColor = "#082c6c"
        darkModeButton.innerHTML = "<i class='fa-solid fa-sun fa-2x'></i>"
        document.body.style.color = "white"
        // textTable.style.color = "white"
        darkModeStatus = true
    }
}

showData()