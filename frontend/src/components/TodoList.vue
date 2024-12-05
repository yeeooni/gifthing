<template>
  <div>
    <input type="text" class="todo-input" placeholder="What needs to be done" v-model="newTodo" @keyup.enter="addTodo"/>
    <div class="todo-item" v-for="(todo, index) in todos" :key="todo.id">
      <input type="checkbox" v-model="todo.completed"/>
      <div class="todo-item-left">
        <div v-if="!todo.editing" class="todo-item-label" @dblclick="editTodo(todo)" :class="{ completed: todo.completed }">{{todo.title}}</div>
        <input v-else class="todo-item-edit" type="text" v-model="todo.title" @blur="doneTodo(todo)" @keyup.enter="doneTodo(todo)" @keyup.esc="cancelTodo(todo)"/>
      </div>
      <div class="remove-item" @click="removeTodo(index)">
        &times;
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'todo-list',
  data() {
    return {
      newTodo: '',  //타이틀
      forIdTodo: 3, //다음 생성될 아이디
      beforeEditTodo: '', //기존 저장된 타이틀
      todos: [
        {
          id: 1,
          title: 'Finish Vue Screencast',
          completed: false,
          editing: false,
        },
        {
          id: 2,
          title: 'Take over world',
          completed: false,
          editing: false,
        },
      ]
    }
  },
  methods: {
    addTodo() {
      if(this.newTodo.trim().length > 0){
        this.todos.push(
            {
              id: this.forIdTodo,
              title: this.newTodo,
              completed: false,
            }
        );

        //아이템 초기화
        this.forIdTodo++;
        this.newTodo = '';
      }
    },
    editTodo(todo){ //수정
      this.beforeEditTodo = todo.title;
      todo.editing = true;
    },
    doneTodo(todo){ //저장
      if(todo.title.trim() == ''){
        todo.title = this.beforeEditTodo;
      }
      todo.editing = false;
    },
    cancelTodo(todo){ //취소
      todo.title = this.beforeEditTodo;
      todo.editing = false;
    },
    removeTodo(index) { //삭제
      this.todos.splice(index, 1)
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
  .todo-input {
    width: 100%;
    padding: 10px 18px;
    font-size: 18px;
    margin-bottom: 16px;
  }

  .todo-item {
    margin-bottom: 12px;
    display: flex;
    align-items: center;
    justify-content: space-between;
  }

  .remove-item {
    cursor: pointer;
    margin-left: 14px;
    &:hover {
      color: black;
    }
  }

  .todo-item-left {
    display: flex;
    align-items: center;
  }

  .todo-item-label {
    padding: 10px;
    border: 1px solid white;
    margin-left: 12px
  }

  .todo-item-edit {
    font-size: 24px;
    color: #2c3e50;
    margin-left: 12px;
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    font-family: Avenir, Helvetica, Arial, sans-serif;

    &:focus{
      outline: none;
    }
  }

  .completed {
    text-decoration: line-through;
    color: gray;
  }

</style>
