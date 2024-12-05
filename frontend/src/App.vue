<template>
  <div id="app" class="container">
    <img src="./assets/images/logo.png"/>
<!--    <div class="menu-bar">-->
<!--      <a v-for="menu in menus" :key="menu">{{ menu }}</a>-->
<!--    </div>-->
<!--    <div>-->
<!--      <h4></h4>-->
<!--      <p><button @click="helloWorld">버튼 클릭!</button></p>-->
<!--    </div>-->
<!--    <br/>-->

    <h3>TODO LIST</h3>
    <todo-list></todo-list>
  </div>
</template>

<script>
import TodoList from "@/components/TodoList.vue";

export default {
  name: 'App',
  data(){
    return {
      menus: ['Home', 'Login', 'MyPage']
    }
  },
  methods : {
    helloWorld () {
      alert('Hello World!');
    }
  },
  components: {
    TodoList,
  }
}
</script>

<style>

*{
  box-sizing: border-box;
}

.container {
  max-width: 600px;
  margin: 0 auto;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

.logo {
  display: block;
  margin: 20px auto;
}

.menu-bar {
  background-color: #2c3e50;
  border-radius: 5px;
  padding: 50px;
}

.menu-bar a {
  color: white;
  padding: 10px;
}
</style>
