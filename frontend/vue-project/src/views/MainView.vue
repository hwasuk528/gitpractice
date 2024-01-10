<template>
    <div>
        <h1>ssa나무다리</h1>
        <router-view></router-view>
        
        <Search></Search>
        
    </div>
</template>

<script>
import List from '@/components/main/list.vue';
import Search from '@/components/main/search.vue';

    export default {
    components: { List, Search }
}
</script>

<style scoped>

</style>