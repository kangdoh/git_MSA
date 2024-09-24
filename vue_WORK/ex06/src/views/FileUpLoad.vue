<template>
    <div>
        <h1>파일 업로드.</h1>
        <div>
            <input type="file" name="file" @change="onFileChange">
        </div>
        <button type="button" @click="save">전송</button>

        <div>
            myfile = {{ myfile }}
        </div>
    </div>
</template>


<script setup>
import axios from 'axios';
import { ref } from 'vue';

const myfile = ref('')
const save =()=>{
    // console.log(Boolean(myfile.value)); -> 값이 있으면 true
    if( !myfile.value ){
        // 파일이 없다 -> true
        alert('파일을 선택하세요.');
        return;
    }

    const formDate = new FormData();
    formDate.append("file", myfile.value);
    formDate.append("fileDto", {"name": "filename"});

    axios.post('http://localhost:10000/file/upload', formDate,{
        headers : {'content-Type':'multipart/form-date'}
    });
};

const onFileChange = (e)=>{
    myfile.value = e.target.value;
}
</script>


<style scoped></style>