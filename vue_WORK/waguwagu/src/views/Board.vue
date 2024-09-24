<template>
  <div>
    <h1>게시판</h1>

    <table class="tata">
      <thead>
        <tr>
          <th>IDX</th>
          <th>Title</th>
          <th>Content</th>
          <th>Author</th>
          <th>Reg Date</th>
          <th>View Count</th>
        </tr>
      </thead>
      <tbody class="sss">
        <tr>
          <td>1</td>
          <td>올리브오일 짜파게티</td>
          <td>쉽고 맛있게</td>
          <td>일요일요리사</td>
          <td>2023-09-23</td>
          <td>100</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script setup></script>

<style scoped>
body {
  font-family: Arial, sans-serif;
  background-color: #f4f4f4;
  margin: 20px;
}
.tata {
  width: 100%;
  border-collapse: collapse;
  background-color: #fff;
}
.tata th,
.tata td {
  border: 1px solid #ddd;
  padding: 12px;
  text-align: left;
}
.tata th {
  background-color: #007bff;
  color: white;
}
.tata tr:nth-child(even) {
  background-color: #f9f9f9;
}
.tata tr:hover {
  background-color: #f1f1f1;
  cursor: pointer;
}
</style>
