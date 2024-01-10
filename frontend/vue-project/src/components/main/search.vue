<template>
    <div>
      <h2>search</h2>
      <form @submit.prevent="submitUser">
        <label for="userId">ID:</label>
        <input type="text" id="userId" v-model="user.id" required>
        
        <label for="userNickname">Nickname:</label>
        <input type="text" id="userNickname" v-model="user.nickname" required>
        
        <label for="userMode">Mode:</label>
        <input type="text" id="userMode" v-model="user.mode" required>
        
        <label for="userResult">Result:</label>
        <input type="checkbox" id="userResult" v-model="user.result" required>
        
        <button type="submit">등록</button>
      </form>
    </div>
  </template>
  
  <script>
  import { ref } from "vue";
  import { useMainStore } from "@/stores/main";
  
  export default {
    setup() {
      const user = ref({
        id: "",
        nickname: "",
        mode: "",
        result: false,
      });
  
      const mainStore = useMainStore();
  
      const mainList = mainStore.mainList;

      const submitUser = () => {
      mainStore.createMainList(user.value).then(() => {
   
    mainStore.getMainList();
      });
    };
  
      return {
        user,
        submitUser,
      };
    },
  };
  </script>
  
  <style scoped>

  </style>
  