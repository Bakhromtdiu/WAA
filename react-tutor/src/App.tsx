import React from 'react';
import ListModel from "./components/ListModel";


function App() {
    const cities = ['Bukahara', 'Samarqand', 'Tashkent'];
    const handleSelectItem = (item: string) => {
        console.log(item);
    }
    return (
        <div><ListModel items={cities} heading={"cities"} onSelectItem={handleSelectItem}></ListModel></div>
    );
}

export default App;
