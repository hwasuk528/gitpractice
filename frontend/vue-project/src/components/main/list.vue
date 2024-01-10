<template>
    <div>
      <hr>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Nickname</th>
            <th>Mode</th>
            <th>Result</th>
            
          </tr>
        </thead>
        <tbody>
          <tr v-for="user in store.mainList" :key="user.id">
            <td>{{ user.id }}</td>
            <td>{{ user.nickname }}</td>
            <td>{{ user.mode }}</td>
            <td>{{ user.result }}</td>
            
          </tr>
        </tbody>
      </table>
    </div>
  </template>

<script setup>
import { useMainStore } from "@/stores/main";
import { onMounted } from "vue";

const store = useMainStore()

onMounted(() => {
    store.getMainList()
})

</script>

<style scoped></style>