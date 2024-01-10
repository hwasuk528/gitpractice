import { ref } from 'vue';
import { defineStore } from 'pinia';
import axios from 'axios';

const URL = "http://localhost:8080/user";

export const useMainStore = defineStore('main', () => {
  const mainList = ref([]);
  const main = ref(null);

  const getMainList = function () {
    return new Promise((resolve, reject) => {
      axios.get(URL)
        .then((response) => {
          mainList.value = response.data;
          resolve(response.data); 
        })
        .catch((error) => {
          console.error(error);
          reject(error); 
        });
    });
  };

  const createMainList = function (user) {
    return new Promise((resolve, reject) => {
      axios.post(URL, user)
        .then((response) => {
          resolve(response.data); 
        })
        .catch((error) => {
          console.error(error);
          reject(error); 
        });
    });
  };

  return {
    createMainList,
    getMainList,
    mainList,
    main,
  };
});
