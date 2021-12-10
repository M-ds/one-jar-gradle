<template>
  <h1>{{ title }}</h1>
  <img alt="Vue logo" src="./assets/logo.png">
  <div v-if="personWithAddress != null">
    <h3>{{ personWithAddress.person.firstName }}</h3>
    <div>{{ personWithAddress.person.lastName }}</div>
    <div>{{ personWithAddress.person.age }}</div>
    <hr>
    <h3>{{ personWithAddress.address.streetName }}</h3>
    <div>{{ personWithAddress.address.streetNumber }}</div>
    <div>{{ personWithAddress.address.streetNumberExtension }}</div>
    <div>{{ personWithAddress.address.postalCode }}</div>
    <div>{{ personWithAddress.address.city }}</div>
  </div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
      title: "Hello World!",
      personWithAddress: null
    }
  },
  async created() {
    await this.$store.dispatch("getPersonData");
    this.personWithAddress = this.$store.getters.getPersonsWithAddress.personDto;
    console.log(JSON.stringify(this.personWithAddress))
  }
}
</script>

<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
