import React, {useEffect, useState} from 'react';
import './App.css';
import {Header} from "./Header";
function App() {
    const [todos, setTodos] = useState([]);

    // useEffect(() => {
    //     async function getTodos() {
    //         const responce = await fetch('https://localhost:3004');
    //         const data = await responce.json();
    //         setTodos(data);
    //     }
    //     getTodos();
    // })

    return (
    <Header/>
)
    ;
}
export default App;
