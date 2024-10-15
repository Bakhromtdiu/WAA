import React from 'react';
import ListGroup from "./components/listGroup";

const App = () => {

    let items = ["bukhara", "samarqand", "tashkent"];
    const handleSelectedItem = (item: string) => {
        console.log(item);
    }
    return <div><ListGroup items={items} heading="cities" onSelectItem={handleSelectedItem}/></div>;
};

export default App;