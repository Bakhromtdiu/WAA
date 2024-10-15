import {Fragment, useState} from "react";

interface Props {
    items: string[],
    heading: string,
    onSelectItem: (item: string) => void;
}

function ListModel({items, heading, onSelectItem}: Props) {
    const [selectedItem, setSelectedItem] = useState(-1);
    return <Fragment>
        <ul className="list-group">
            {items.map((city, index) => <li key={index}
                                            className={selectedItem === index ? "list-group-item active" : "list-group-item"}
                                            onClick={() => {
                                                setSelectedItem(index);
                                                onSelectItem(city)
                                            }}>{city}</li>)}
        </ul>
    </Fragment>
}

export default ListModel;