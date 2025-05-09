
Vue.component('mi-contador, {
    data() {
        return { count: 0 }
    },
    methods: {
      addCount() {
        this.count++;
      },
    },
    template: `<div>Count is: {{ count }} <button type="button" @click="addCount">+1</button></div>`
})