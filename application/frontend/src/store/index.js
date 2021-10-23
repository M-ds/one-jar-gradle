import {createStore} from 'vuex';
import {PersonService} from "@/service/PersonService";

export default createStore({
  state: {
    personsWithAddress: null
  },
  mutations: {
    setPersonsWithAddress(state, personsWithAddress) {
      state.personsWithAddress = personsWithAddress;
    }
  },
  actions: {
    async getPersonData(context) {
      const personsWithAddress = await new PersonService().getPersonWithAddress();
      context.commit("setPersonsWithAddress", personsWithAddress)
    }
  },
  getters: {
    getPersonsWithAddress: (state) => {
      return state.personsWithAddress;
    }
  }
})
